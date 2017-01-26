package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_38 {
    private final Production2_38 production = new Production2_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}