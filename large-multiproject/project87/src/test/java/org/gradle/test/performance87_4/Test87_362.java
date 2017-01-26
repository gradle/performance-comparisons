package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_362 {
    private final Production87_362 production = new Production87_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}