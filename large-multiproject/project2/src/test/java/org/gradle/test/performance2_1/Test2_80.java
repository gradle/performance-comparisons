package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_80 {
    private final Production2_80 production = new Production2_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}