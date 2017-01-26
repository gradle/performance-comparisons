package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_338 {
    private final Production87_338 production = new Production87_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}