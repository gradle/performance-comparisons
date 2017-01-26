package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_388 {
    private final Production87_388 production = new Production87_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}