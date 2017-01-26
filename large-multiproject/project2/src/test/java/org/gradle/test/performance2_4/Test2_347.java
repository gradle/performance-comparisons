package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_347 {
    private final Production2_347 production = new Production2_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}