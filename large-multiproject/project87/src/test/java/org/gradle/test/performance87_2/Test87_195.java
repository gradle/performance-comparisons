package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_195 {
    private final Production87_195 production = new Production87_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}