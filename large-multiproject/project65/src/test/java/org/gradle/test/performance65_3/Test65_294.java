package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_294 {
    private final Production65_294 production = new Production65_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}