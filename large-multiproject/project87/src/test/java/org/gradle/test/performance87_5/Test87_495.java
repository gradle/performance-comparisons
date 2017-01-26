package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_495 {
    private final Production87_495 production = new Production87_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}