def lcpOfAllSubstrings(s):
  for i in range(len(s)):
    count = 0
    for l1, l2 in zip(s, s[i:]):
      if l1 != l2:
        break
      count += 1
    print('{}: len(LCP(s({}, {}), s)) = {}'.format(i + 1, i + 1, len(s), count))

# Test code
lcpOfAllSubstrings("ababac")
