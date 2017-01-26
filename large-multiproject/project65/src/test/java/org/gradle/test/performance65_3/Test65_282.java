package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_282 {
    private final Production65_282 production = new Production65_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}