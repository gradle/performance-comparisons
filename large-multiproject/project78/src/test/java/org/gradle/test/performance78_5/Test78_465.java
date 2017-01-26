package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_465 {
    private final Production78_465 production = new Production78_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}