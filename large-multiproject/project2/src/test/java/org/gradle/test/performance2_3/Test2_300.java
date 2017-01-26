package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_300 {
    private final Production2_300 production = new Production2_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}