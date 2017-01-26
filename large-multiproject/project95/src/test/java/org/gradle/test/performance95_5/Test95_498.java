package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_498 {
    private final Production95_498 production = new Production95_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}