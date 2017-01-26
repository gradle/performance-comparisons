package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_289 {
    private final Production87_289 production = new Production87_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}