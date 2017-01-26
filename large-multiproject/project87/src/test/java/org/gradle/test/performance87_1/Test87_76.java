package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_76 {
    private final Production87_76 production = new Production87_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}