package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_85 {
    private final Production22_85 production = new Production22_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}