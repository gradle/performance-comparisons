package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_498 {
    private final Production33_498 production = new Production33_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}