package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_73 {
    private final Production68_73 production = new Production68_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}