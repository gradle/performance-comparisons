package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_85 {
    private final Production84_85 production = new Production84_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}