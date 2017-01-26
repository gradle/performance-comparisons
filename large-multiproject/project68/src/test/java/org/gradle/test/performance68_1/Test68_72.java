package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_72 {
    private final Production68_72 production = new Production68_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}