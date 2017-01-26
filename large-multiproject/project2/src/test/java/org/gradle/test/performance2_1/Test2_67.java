package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_67 {
    private final Production2_67 production = new Production2_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}