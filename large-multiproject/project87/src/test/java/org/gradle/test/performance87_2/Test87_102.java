package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_102 {
    private final Production87_102 production = new Production87_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}