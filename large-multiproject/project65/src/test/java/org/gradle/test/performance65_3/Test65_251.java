package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_251 {
    private final Production65_251 production = new Production65_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}