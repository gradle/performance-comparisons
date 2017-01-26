package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_255 {
    private final Production87_255 production = new Production87_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}