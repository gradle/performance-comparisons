package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_73 {
    private final Production87_73 production = new Production87_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}