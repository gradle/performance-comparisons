package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_10 {
    private final Production2_10 production = new Production2_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}