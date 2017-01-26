package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_225 {
    private final Production65_225 production = new Production65_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}