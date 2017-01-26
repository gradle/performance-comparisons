package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_392 {
    private final Production78_392 production = new Production78_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}