package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_44 {
    private final Production2_44 production = new Production2_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}