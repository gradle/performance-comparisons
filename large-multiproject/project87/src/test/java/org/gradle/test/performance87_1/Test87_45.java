package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_45 {
    private final Production87_45 production = new Production87_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}