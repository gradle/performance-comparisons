package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_157 {
    private final Production2_157 production = new Production2_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}