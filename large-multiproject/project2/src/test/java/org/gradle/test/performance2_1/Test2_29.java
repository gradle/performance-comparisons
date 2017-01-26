package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_29 {
    private final Production2_29 production = new Production2_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}