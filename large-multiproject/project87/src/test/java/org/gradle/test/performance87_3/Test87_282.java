package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_282 {
    private final Production87_282 production = new Production87_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}