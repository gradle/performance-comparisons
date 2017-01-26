package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_41 {
    private final Production2_41 production = new Production2_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}