package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_263 {
    private final Production68_263 production = new Production68_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}