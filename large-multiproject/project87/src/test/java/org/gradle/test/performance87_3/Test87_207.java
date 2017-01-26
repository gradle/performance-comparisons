package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_207 {
    private final Production87_207 production = new Production87_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}