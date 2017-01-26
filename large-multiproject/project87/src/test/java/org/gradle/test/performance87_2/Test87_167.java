package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_167 {
    private final Production87_167 production = new Production87_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}