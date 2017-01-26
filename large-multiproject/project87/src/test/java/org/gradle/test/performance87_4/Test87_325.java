package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_325 {
    private final Production87_325 production = new Production87_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}