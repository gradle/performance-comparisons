package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_85 {
    private final Production4_85 production = new Production4_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}