package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_216 {
    private final Production78_216 production = new Production78_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}