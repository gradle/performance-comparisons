package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_498 {
    private final Production81_498 production = new Production81_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}