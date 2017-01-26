package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_353 {
    private final Production22_353 production = new Production22_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}