package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_498 {
    private final Production65_498 production = new Production65_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}