package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_288 {
    private final Production87_288 production = new Production87_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}