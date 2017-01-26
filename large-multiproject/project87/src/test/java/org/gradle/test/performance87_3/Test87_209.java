package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_209 {
    private final Production87_209 production = new Production87_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}