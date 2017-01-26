package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_49 {
    private final Production87_49 production = new Production87_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}