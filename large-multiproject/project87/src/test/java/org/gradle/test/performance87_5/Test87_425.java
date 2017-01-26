package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_425 {
    private final Production87_425 production = new Production87_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}