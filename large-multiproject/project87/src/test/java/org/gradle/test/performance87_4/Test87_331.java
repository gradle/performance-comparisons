package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_331 {
    private final Production87_331 production = new Production87_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}