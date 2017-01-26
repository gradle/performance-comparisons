package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_27 {
    private final Production68_27 production = new Production68_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}