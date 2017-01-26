package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_85 {
    private final Production31_85 production = new Production31_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}