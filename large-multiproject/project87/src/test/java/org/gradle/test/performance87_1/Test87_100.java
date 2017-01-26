package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_100 {
    private final Production87_100 production = new Production87_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}