package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_77 {
    private final Production87_77 production = new Production87_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}