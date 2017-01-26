package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_498 {
    private final Production45_498 production = new Production45_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}