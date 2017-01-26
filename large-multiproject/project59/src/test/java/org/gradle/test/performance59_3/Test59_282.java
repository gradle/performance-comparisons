package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_282 {
    private final Production59_282 production = new Production59_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}