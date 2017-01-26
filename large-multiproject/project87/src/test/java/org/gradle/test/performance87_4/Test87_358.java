package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_358 {
    private final Production87_358 production = new Production87_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}